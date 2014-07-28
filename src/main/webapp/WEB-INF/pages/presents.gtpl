<html>
    <head>
    	<title>Lista prezent�w</title>
    </head>
    <body>
        <div class="jumbotron center" bgcolor="#FFDAB9">
        	<div class="panel panel-default">
        		<div class="panel-body">
        			<p>
	        		<small><em>Poni�ej  znajduje si� lista proponowanych przez nas prezent�w. Prosimy traktowa� j� jedynie jako sugesti�, ka�dy inny prezent b�dzie r�wnie mile widziany. Oczywi�cie mo�na wsp�lnie sk�ada� si� na prezenty. <br /> <br />
	        		Prosimy o klikni�cie przycisku "Rezerwuj" przy wybranym prezencie. Wszelkie w�tpliwo�ci i pytania prosimy kierowa� na adres:  <br /><a href="mailto:juliusz.dabrowa@gmail.com">juliusz.dabrowa@gmail.com</a> <br /> 
	        		Prosimy r�wnie� o kontakt w razie rezygnacji z wybranego prezentu. <br /><br />Dzi�kujemy!</em></small> <br /><br />
					<b>Uwaga!</b> Lista jest na razie pusta, ale z czasem b�d� pojawia� si� na niej kolejne propozycje.
	        		</p>
	        	</div>
        	</div>
        	<br />
        	
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

