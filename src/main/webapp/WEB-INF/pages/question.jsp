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
                    <li>
                        <a href="${pageContext.request.contextPath}/role">
                            <i class="material-icons">person</i>
                            <p>Role</p>
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
					<li class="active"><a href="${pageContext.request.contextPath }/question">
							<i class="material-icons">library_books</i>
							<p>Questions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/version">
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
						<a class="navbar-brand" href="#"> Questions Datatable </a>
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
									<h4 class="title">Questions</h4>
								</div>
								<div class="card-content table-responsive">
									<!-- <input type="search" name="search" placeholder="Search by Question" /> -->
									<button type="button" id="tambahQuestion" class="btn btn-sm btn-primary">+</button>
									<table id="table-user" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>Question Name</th>
                                            <th>Action</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="quest" items="${questions }">
                                            	<tr>
                                            		<td><c:out value="${quest.question }"></c:out></td>
                                            		<td>
                                            			<a id="${quest.id }" href="#" class="btn-hapus btn btn-danger btn-xs">Delete</a>
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
						<input type="hidden" class="form-control" id="active"/>
						<label for="question">Question:</label>
						<textarea id="question" class="form-control" rows="5" placeholder="Enter a question"></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="saveQuestion" class="btn btn-primary">Add</button>
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="editQuestion" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalCenterTitle">Are you sure?</h5>
				</div>
				<form id="editForm" action="#" method="POST">
					<div class="modal-body">
						<div class="form-group">
						<input type="hidden" class="form-control" id="id-question" name="id-question"/>
						<input type="hidden" class="form-control" id="created-on" name="created-on"/>
						<input type="hidden" class="form-control" name="isDelete" id="actives" value="true"/>
						<label for="question">Question:</label>
						<textarea id="questions" class="form-control" name="question" rows="5" placeholder="Enter a question" readonly="readonly"></textarea>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="deleteQuestion" class="btn btn-danger">Delete</button>
						<button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
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
		$('#saveQuestion').click(function(event) {
			event.preventDefault();
			var question = jQuery('#question').val();
			var asd = jQuery('#active').val();
			var date = new Date();
			
			var questions = {
					question: question,
					isDelete: asd,
					createdOn: date
			};
			console.log(questions);
			
			jQuery.ajax({
				url: '${pageContext.request.contextPath}/question/save',
				type: 'post',
				beforeSend: function(){
					console.log(questions);
					console.log('mau contact server..');
				},
				contentType: 'application/json',
				dataType: "json",
				data: JSON.stringify(questions),
				success: function(data) {
					console.log('dapat data dari server');
					console.log(data);
					window.location = '${pageContext.request.contextPath}/question'
					alert('data berhasil ditambahkan')
				}
			});
		});
	});

$(document).ready(function() {
	
	var button1 = jQuery('.btn-hapus').click(function(event){
		event.preventDefault();
		var id = $(this).attr('id');
		 $.ajax({
			 url : '${pageContext.request.contextPath}/question/get/'+ id,
			 type: 'GET',
			 success : function(data){
				 $('#id-question').val(data.id);
				 $('#created-on').val(data.createdOn)
				 $('textarea[name="question"]').val(data.question);
				 $('input[name="isDelete"]').val(data.isDelete = true);
			 },
			 dataType: 'json'
		 })
		$('#editQuestion').modal();
	 });
	
	var button = jQuery('#deleteQuestion').click(function(event){
		event.preventDefault();
		var d = new Date();
		var questionss = {
			id : $('#id-question').val(),
			question : $('#questions').val(),
			isDelete :  $('#actives').val(),
			createdOn : $('#created-on').val(),
			deletedOn : d
		}
			
		jQuery.ajax({
			url : '${pageContext.request.contextPath}/question/update',
			type: 'POST',
			beforeSend: function(){
				console.log(questionss);
				console.log('contact server');
			},
			data: JSON.stringify(questionss),
			headers: {
				'Accept' : 'application/json',
				'Content-Type' : 'application/json'
			},
			success : function(data){
			console.log(data);
			alert('berhasil dihapus');
			window.location = "${pageContext.request.contextPath}/question";
			}
		});
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
	
	$('#table-user').DataTable();

	//logout event button
	$('#logout').click(function(event) {
		event.preventDefault();
		$('#logoutForm').submit();
	});

	//modal tambah question
	$('#tambahQuestion').click(function(event) {
		event.preventDefault();
		$('#addQuestion').modal();
	});

});
</script>

</html>