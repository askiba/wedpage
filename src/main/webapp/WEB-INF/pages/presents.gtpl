<html>
    <head>
    	<title>Lista prezent�w</title>
    </head>
    <body>
        <div class="jumbotron center">
            <table class="table table-hover">
				<thead>
					<tr>
						<th>Lp.</th>
					
						<th>Nazwa</th>
					
						<th>Sczeg�y</th>
					
						<th>Cena</th>
					</tr>
				</thead>
				<tbody>
				<% request.list.each { present -> %>
					<td>${present.id}</td>
					<td>${present.name}</td>
					<td>${present.details}</td>
					<td>0</td>
					</p>
				<% } %>
				</tbody>
			</table>
        </div>
    </body>
</html>

