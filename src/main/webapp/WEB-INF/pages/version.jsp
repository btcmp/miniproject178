<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="${pageContext.request.contextPath}/resources/assets/img/apple-icon.png" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Material Dashboard by Creative Tim</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />
<meta name="_csrf" content="${_csrf.token}" />
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}" />
<!-- Bootstrap core CSS     -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<!--  Material Dashboard CSS    -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/material-dashboard.css?v=1.2.0"
	rel="stylesheet" />
<!--  CSS for Demo Purpose, don't include it in your project     -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/demo.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css"
	rel="stylesheet" />
<!--     Fonts and icons     -->
<link
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons'
	rel='stylesheet' type='text/css'>
<style>
input.parsley-error {
	color: #B94A48 !important;
	background-color: #F2DEDE !important;
	border: 1px solid #EED3D7 !important;
}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar" data-color="purple"
			data-image="${pageContext.request.contextPath}/resources/assets/img/sidebar-1.jpg">
			<!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text"> Batch 178 </a>
			</div>
			<div class="sidebar-wrapper">
				<ul class="nav">
					<li><a href="dashboard.html"> <i
							class="material-icons">dashboard</i>
							<p>Dashboard</p>
					</a></li>
					<li>
                        <a href="${pageContext.request.contextPath }/department">
                            <i class="material-icons">library_books</i>
                            <p>Department</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath}/employee">
							<i class="material-icons">bubble_chart</i>
							<p>Employee</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath}/account">
							<i class="material-icons">person</i>
							<p>User Account</p>
					</a></li>
					<li>
                        <a href="${pageContext.request.contextPath}/user">
                            <i class="material-icons">person</i>
                            <p>User</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath }/biodata"> 
						<i class="material-icons">person</i>
						<p>Biodata</p>
					</a></li>
					<li>
                        <a href="${pageContext.request.contextPath }/office">
                            <i class="material-icons">work</i>
                            <p>Office</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath }/question">
							<i class="material-icons">library_books</i>
							<p>Questions</p>
					</a></li>
					<li class="active"><a href="${pageContext.request.contextPath }/version">
							<i class="material-icons">library_books</i>
							<p>Versions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/technology">
							<i class="material-icons">library_books</i>
							<p>Technology</p>
					</a></li>
					<li><a href="#" id="logout"> <i class="material-icons">block</i>
							<p>Logout</p>
					</a></li>
					<form action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</ul>
			</div>
		</div>
		<div class="main-panel">
			<nav class="navbar navbar-primary navbar-absolute">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"> Versions Datatable </a>
					</div>
				</div>
			</nav>
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<c:if test="${not empty message}">
								<div class="alert alert-info">
									<c:out value="${message }"></c:out>
								</div>
							</c:if>
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Versions</h4>
								</div>
								<div class="card-content table-responsive">
									<!-- <input type="search" name="search" placeholder="Search by Question" /> -->
									<button type="button" id="tambahVersion" class="btn btn-sm btn-primary">+</button>
									<table id="table-version" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>Version</th>
                                            <th>Action</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="ver" items="${versions }">
                                            	<tr>
                                            		<td><c:out value="${ver.version }"></c:out></td>
                                            		<td>
                                            			<a id="${ver.id }" href="#" class="btn-hapus btn btn-danger btn-xs">Delete</a>
                                            		</td>
                                            	</tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<footer class="footer">
				<div class="container-fluid">
					<nav class="pull-left">
						<ul>
							<li><a href="#"> Home </a></li>
							<li><a href="#"> Company </a></li>
							<li><a href="#"> Portfolio </a></li>
							<li><a href="#"> Blog </a></li>
						</ul>
					</nav>
					<p class="copyright pull-right">
						&copy;
						<script>
							document.write(new Date().getFullYear())
						</script>
						<a href="http://www.creative-tim.com">Creative Tim</a>, made with
						love for a better web
					</p>
				</div>
			</footer>
		</div>
	</div>
	<!--modal-->
	<div class="modal fade" id="addVersion" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalCenterTitle">Version</h5>
				</div>
				<form id="addForm" action="#" method="POST">
					<div class="modal-body">
						<div class="form-group">
						<label for="version">Version:</label>
						<input type="text" name="version" id="version" class="form-control"/>
						<button type="button" id="tambahQuestion" class="btn btn-sm btn-primary">+</button>
						<div class="card-content table-responsive">
	               			<table id="table-user" class="table table-hover">
	                   			<thead class="text-warning">
		                   			<tr>
				                       <th>Question</th>
		                   			</tr>
	                   			</thead>
	                   			<tbody id="list-question">
	                   				
	                   			</tbody>
	                 		</table>
	             		</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="saveVersion" class="btn btn-primary">Add</button>
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<!-- modal tambah question pada version -->
	<div class="modal fade" id="addQuestion" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalCenterTitle">Question</h5>
				</div>
				<form id="addForm" action="#" method="POST">
					<div class="modal-body">
						<div class="form-group">
						<label for="version">Version:</label>
						<select class="form-control" id="selected" name="question.id">
							<option selected="selected">Pilih Question</option>
							<c:forEach items="${questions}" var="quest">
							<option value="${quest.id }">${quest.question }</option>
							</c:forEach>
						</select><br>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="saveQuestion" class="btn btn-primary">Add</button>
						<button type="button" id="cancelQuestion" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
<!--   Core JS Files   -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/js/material.min.js"
	type="text/javascript"></script>
<!--  Charts Plugin -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<!--  Notifications Plugin    -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" />
<script
	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js" />
<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/demo.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		$('#saveVersion').click(function(event) {
			event.preventDefault();
			var version = jQuery('#version').val();
			
			var versions = {
					version: version
			};
			console.log(versions);
			
			jQuery.ajax({
				url: '${pageContext.request.contextPath}/version/save',
				type: 'post',
				beforeSend: function(){
					console.log(versions);
					console.log('mau contact server..');
				},
				contentType: 'application/json',
				dataType: "json",
				data: JSON.stringify(versions),
				success: function(data) {
					console.log('dapat data dari server');
					console.log(data);
					window.location = '${pageContext.request.contextPath}/version'
					alert('data berhasil ditambahkan')
				}
			});
		});
	});

$(document).ready(function() {
	
	$('#saveQuestion').click(function(event) {
		event.preventDefault();
		var questiontxt = $('#selected option:selected').text();
		var questionval = $('#selected option:selected').val();
		
		var oTable = $('#table-user');
		var tbody = oTable.find('tbody');
		var tr = $("<tr>");
		tr.append($('<td val="' + questionval + '">' + questiontxt + '</td>'));
		tr.append($('<td><input type="submit" value="Edit" id="btn_Edit" /></td>'));
		$('table tbody').append(tr);
		$('#selected').val('');
			tbody.append(tr);
			$('#addVersion').modal('show');
			$('#addQuestion').modal('hide');
	});
	
	$(document).on('click', '#btn_Edit', function() {
		  var currentTr = $(this).closest('tr');
		  var indx = $(currentTr).prop('index');
		  var questionval = $(currentTr).find('td').eq(0).attr('val');
		  $('#selected').val(questionval);
		  currentTr.remove();
	});

	
	/* $("#addQuestion").on("click","#tambahQuestion", function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/version/addSelection.html",
			type: "get",
			dataType: "html",
			success: function(result) {
				$("#addVersion").find(".modal-body").html(result);
				$("#addVersion").modal("show");
			}
		});
	});
	
	$("#addVersion").on("click","#saveQuestion", function(){
		var selected = $("#addVersion").find("#question option:selected");
		var idQuestion = selected.val();
		var textQuestion = selected.text();
		var items = '<tr><td>'+ textQuestion +'</td>'+
		'<td><button type="button" class="btn btn-danger btn-xs btn-delete-question"><i class="fa fa-trash"></i></button></td>'+'</tr>';
		$("#addQuestion").find("#list-question").append(items);
		$("#addVersion").modal("hide");
	});
	
	$("#addQuestion").on("submit", "#addForm", function() {
		$.ajax({
			url: "version/create.json",
			src: "${pageContext.request.contextPath}/question/create.json/",
			type: "get",
			dataType: "json",
			data:$(this).seriallize(),
			success: function(result){
				$("#addQuestion").modal("hide");
				alert("question successfully added!");
				listQuestion();
			}
		});
		return false;
	}); */
	
	$('.btn-hapus').on('click', function(){
		var id = $(this).attr('id');
		 $.ajax({
			 url : '${pageContext.request.contextPath}/question/get/'+ id,
			 type: 'GET',
			 success : function(data){
				 $('textarea[name="question"]').val(data.question);
				 $('input[name="isDelete"]').val(data.isDelete = true);
			 },
			 dataType: 'json'
		 })
		$('#editQuestion').modal();
	 });
	
	$('#deleteQuestion').on('click', function(){
		var validate = $('#addForm').parsley();
		if(validate.validate()){
			var questionss = {
				question : $('#questions').val(),
				isDelete :  $('#actives').val()
			}
			
			ajaxSetUp();
			$.ajax({
				url : '${pageContext.request.contextPath}/question/save',
				type: 'POST',
				data: JSON.stringify(questionss),
				contentType: "application/json",
				success : function(data){
					window.location = "${pageContext.request.contextPath}/question";
				},error: function(){
					console.log(questionss);
					alert('update failed');
				}
			});
		}
	 });
	
	//setting up datepicker
	$('#birthDate123').datepicker();
	
	function ajaxSetUp() {
		var token = $("meta[name='_csrf']").attr("content");
		var header = $("meta[name='_csrf_header']").attr(
				"content");
		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});
	}
	
	$('#table-version').DataTable();
	$('#table-question').DataTable();

	//logout event button
	$('#logout').click(function(event) {
		event.preventDefault();
		$('#logoutForm').submit();
	});

	//modal tambah version
	$('#tambahVersion').click(function(event) {
		event.preventDefault();
		$('#addVersion').modal();
	});
	
	//modal tambah question
	$('#tambahQuestion').click(function(event) {
		event.preventDefault();
		$('#addVersion').modal('hide');
		$('#addQuestion').modal('show');
	});
	
	//modal save version
	$('#saveQuestion').click(function(event) {
		event.preventDefault();
		$('#addVersion').modal('show');
		$('#addQuestion').modal('hide');
	});
	
	//modal cancel question
	$('#cancelQuestion').click(function(event) {
		event.preventDefault();
		$('#addVersion').modal('show');
		$('#addQuestion').modal('hide');
	});

});
</script>

</html>