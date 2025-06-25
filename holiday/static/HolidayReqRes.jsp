<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
                 <div class="container-fluid">
                   <a class="navbar-brand" href="#">Navbar</a>
                   <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                     <span class="navbar-toggler-icon"></span>
                   </button>
                   <div class="collapse navbar-collapse" id="navbarNav">
                     <ul class="navbar-nav">
                       <li class="nav-item">
                         <a class="nav-link active" aria-current="page" href="HolidayReq.jsp">Home</a>
                       </li>
                       <li class="nav-item">
                         <a class="nav-link" href="HolidayReqRes.jsp">Result</a>
                       </li>
                     </ul>
                   </div>
                 </div>
             </nav>

             <h1>Holiday Request Submitted</h1>
             <h2>
             Name: ${holidayDTO.name}
             </br>
             Email: ${holidayDTO.email}
             </br>
             Reason: ${holidayDTO.reason}
             </br>
             Start: ${holidayDTO.start}
             </br>
             End: ${holidayDTO.end}
             </br>
             </h2>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>