<html>
    <head>
    	<title>Lista prezentów</title>
    </head>
    <body>
        <div class="jumbotron center">
        	<div class="panel panel-default">
        		<div class="panel-body">
	        		Poni¿sza lista prezentów jest jedynie sugesti¹. Zachêcamy do sk³adania siê na prezenty. Inne pomys³y s¹ równie¿ mile widziane. 
	        		Prosimy o klikniêcie przycisku "Rezerwuj" przy wybranym prezencie. Wszelkie w¹tpliwoœci i pytania prosimy kierowaæ na adres: "adres@...".
	        		Prosimy równie¿ o kontakt w razie rezygnacji z wybranego prezentu. Dziêkujemy!
	        	</div>
        	</div>
        	
        	<% if(request.getAttribute("reservedPresent") != null) { %>
        		<% if (request.success) { %>
        			<div class="alert alert-success" role="alert">Dokonano rezerwacji przedmiotu:<br/><strong>${request.reservedPresent}</strong></div>
        		<% } else { %>
        			<div class="alert alert-danger" role="alert">Przepraszamy, przedmiot zosta³ ju¿ wczeœniej zarezerwowany.</div>
        		<% }
        	} %>
        	
            <table class="table table-hover">
				<thead>
					<tr>
						<th>Lp.</th>
						<th>Nazwa</th>
						<th>Szczegó³y</th>
						<th>Cena</th>
						<th align="center">Rezerwacja</th>
					</tr>
				</thead>
				<tbody class="text-left">
				<% request.list.eachWithIndex { present, index -> %>
					<tr <% if(!present.reserved) { %> class="success" <% } %> >
						<form action="/presents" method="POST">
	         				<input type="hidden" name="id" value="${present.id}">
							<td>${index + 1}</td>
							<td>${present.name}</td>
							<td style="width:70%" align="justify">
								${present.details}
								<% if (present.link != null) { %>
									<br />
									<a href=${present.link}>${present.link}</a>
								<% } %>
							</td>
							<td>${present.price} z³</td>
							<td align="center">
								<% if (!present.reserved) { %>
									<button type="submit" class="btn btn-success">Rezerwuj</button> 	
		  						<% } else { %>
		  							<div> <span class="label label-default"> Zajête <span class="glyphicon glyphicon-ban-circle"> </span></span></div>
		  						<% } %>
		  					</td>
		  				</form>
	  				</tr>
				<% } %>
				</tbody>
			</table>
			
        </div>
    </body>
</html>

