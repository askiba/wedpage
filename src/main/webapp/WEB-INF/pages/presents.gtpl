<html>
    <head>
    	<title>Lista prezentów</title>
    </head>
    <body>
        <div class="jumbotron center">
            <table class="table table-hover">
				<thead>
					<tr>
						<th>Lp.</th>
						<th>Nazwa</th>
						<th>Sczegó³y</th>
						<th>Cena</th>
						<th>Rezerwacja</th>
					</tr>
				</thead>
				<tbody class="text-left">
				<% request.list.eachWithIndex { present, index -> %>
					<tr>
						<form action="presents/reserve" method="POST">
	         				<input type="hidden" name="id" value="${present.id}">
							<td>${index + 1}</td>
							<td>${present.name}</td>
							<td>${present.details}</td>
							<td>${present.price} z³</td>
							<td>
								<% if (!present.reserved) { %>
									<button type="submit" class="btn btn-default">Rezerwuj</button> 
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

