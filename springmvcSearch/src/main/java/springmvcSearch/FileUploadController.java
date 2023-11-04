package springmvcSearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
//		String s=null;
//		System.out.println(s.length());
		return "fileForm";
	}
	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession hs,Model m) {
		
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data=file.getBytes();
		//String path=hs.getServletContext().getRealPath("/")+file.getOriginalFilename();
		String path=hs.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		try{FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("Uploaded");
		m.addAttribute("msg","uploaded success");
		m.addAttribute("filename",file.getOriginalFilename());}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Uploading Error");
			m.addAttribute("msg","uploading problem");
		}
		System.out.println(path);
		
	
		return "filesuccess";
	}

}
