﻿<html>
    <head>
    	<title>Lista prezentów</title>
    </head>
    <body>
        <div class="jumbotron center" bgcolor="#FFDAB9">
        	<div class="panel panel-default">
        		<div class="panel-body">
        			<p>
	        		<small><em>Poniżej  znajduje się lista proponowanych przez nas prezentów. Prosimy traktować ją jedynie jako sugestię, każdy inny prezent będzie równie mile widziany. Oczywiście można wspólnie składać się na prezenty. <br /> <br />
	        		Prosimy o kliknięcie przycisku "Rezerwuj" przy wybranym prezencie. Wszelkie wątpliwości i pytania prosimy kierować na adres:  <br /><a href="mailto:juliusz.dabrowa@gmail.com">juliusz.dabrowa@gmail.com</a> <br /> 
	        		Prosimy również o kontakt w razie rezygnacji z wybranego prezentu. <br /><br />Dziękujemy!</em></small> <br /><br />
					<b>Uwaga!</b> Lista jest na razie pusta, ale z czasem będą pojawiać się na niej kolejne propozycje.
	        		</p>
	        	</div>
        	</div>
        	<br />
        	
        	<% if(request.getAttribute("reservedPresent") != null) { %>
        		<% if (request.success) { %>
        			<div class="alert alert-success" role="alert">Dokonano rezerwacji przedmiotu:<br/><strong>${request.reservedPresent}</strong></div>
        		<% } else { %>
        			<div class="alert alert-danger" role="alert">Przepraszamy, przedmiot został już wcześniej zarezerwowany.</div>
        		<% }
        	} %>
        	
            <table class="table table-hover">
				<thead>
					<tr>
						<th>Lp.</th>
						<th>Nazwa</th>
						<th>Szczegóły</th>
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
							<td>${present.price} zł</td>
							<td align="center">
								<% if (!present.reserved) { %>
									<button type="submit" class="btn btn-success">Rezerwuj</button> 	
		  						<% } else { %>
		  							<div> <span class="label label-default"> Zajęte <span class="glyphicon glyphicon-ban-circle"> </span></span></div>
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

