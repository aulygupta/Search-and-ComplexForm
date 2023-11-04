<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div>
  <h2>Complex Form</h2>
  <div class="alert alert-danger" role="alert">
 
  <form:errors path="person.*"></form:errors>
</div>
    <form class="container mt-4" action="handleform" method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="email" name="email" placeholder="name@example.com">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Select continent</label>
    <select class="form-control" id="exampleFormControlSelect1" name="exampleFormControlSelect1">
      <option>Asia</option>
      <option>Africa</option>
      <option>Antarctica</option>
      <option>North America</option>
      <option>South America</option>
      <option>Europe</option>
      <option>Australia</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Example multiple select</label>
    <select multiple class="form-control" id="exampleFormControlSelect2" name="exampleFormControlSelect2">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Description</label>
    <textarea class="form-control" id="desc"  name="desc" rows="3"></textarea>
  </div>
   <div class="form-group">
  <input type="date" class="form-control" name="date1" id="date1" placeholder="Enter Date"/>
  </div>
  <div class="card">
  <div class="card-body">
  <p>Your address</p>
  <div class="form-group">
  <input type="text" class="form-control" name="address.street" id="street" placeholder="Enter Street"/>
  </div>
  <div class="form-group">
  <input type="text" class="form-control" name="address.city" id="city" placeholder="Enter City"/>
  </div>
  </div>
  </div>
  <div class="container mt-5 text-center">
<button type="submit" class="btn btn-success">Submit</button>
</div>
</form>
</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>