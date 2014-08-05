<html>
    <head>
    	<title>Dodaj prezent</title>
    </head>
    <body>
        <div class="jumbotron center">
	        <form class="form-horizontal" role="form" action="/presents/add" method="POST">
	   			<div class="form-group">
	    			<label for="name" class="col-sm-2 control-label">Nazwa:</label>
    				<div class="col-sm-10">
		      			<input type="text" class="form-control" name="name" id="name">
		   			</div>
			   	</div>
			  	<div class="form-group">
	    			<label for="details" class="col-sm-2 control-label">Szczegóły:</label>
    				<div class="col-sm-10">
    					<textarea class="form-control" name="details" id="details" rows="3"></textarea>
		   			</div>
			   	</div>
			   	<div class="form-group">
	    			<label for="link" class="col-sm-2 control-label">Link:</label>
    				<div class="col-sm-10">
		      			<input type="URL" class="form-control" name="link" id="link">
		   			</div>
			   	</div>
			   	<div class="form-group">
	    			<label for="name" class="col-sm-2 control-label">Cena:</label>
	    				<div class="col-sm-10">
			      			<input type="float" class="form-control" name="price" id="price">
			   			</div>
			   	</div>
	  		<div class="form-group" >
	    		<div class="col-sm-offset-2 col-sm-10">
	      			<button type="submit" class="btn btn-success">Dodaj</button>
	    		</div>
	  		</div>
	   		
			</form>
        </div>
    </body>
</html>

