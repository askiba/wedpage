<html>
    <head>
    	<title>Lista prezent�w</title>
    </head>
    <body>
        <div class="jumbotron center">
        	<div class="panel panel-default">
        		<div class="panel-body">
	        		Poni�sza lista prezent�w jest jedynie sugesti�. Zach�camy do sk�adania si� na prezenty. Inne pomys�y s� r�wnie� mile widziane. 
	        		Prosimy o klikni�cie przycisku "Rezerwuj" przy wybranym prezencie. Wszelkie w�tpliwo�ci i pytania prosimy kierowa� na adres: "adres@...".
	        		Prosimy r�wnie� o kontakt w razie rezygnacji z wybranego prezentu. Dzi�kujemy!
	        	</div>
        	</div>
        	
        	<% if(request.getAttribute("reservedPresent") != null) { %>
        		<% if (request.success) { %>
        			<div class="alert alert-success" role="alert">Dokonano rezerwacji przedmiotu:<br/><strong>${request.reservedPresent}</strong></div>
        		<% } else { %>
        			<div class="alert alert-danger" role="alert">Przepraszamy, przedmiot zosta� ju� wcze�niej zarezerwowany.</div>
        		<% }
        	} %>
        	
            <table class="table table-hover">
				<thead>
					<tr>
						<th>Lp.</th>
						<th>Nazwa</th>
						<th>Szczeg�y</th>
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
							<td>${present.price} z�</td>
							<td align="center">
								<% if (!present.reserved) { %>
									<button type="submit" class="btn btn-success">Rezerwuj</button> 	
		  						<% } else { %>
		  							<div> <span class="label label-default"> Zaj�te <span class="glyphicon glyphicon-ban-circle"> </span></span></div>
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

