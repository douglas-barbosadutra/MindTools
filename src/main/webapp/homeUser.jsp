<!DOCTYPE jsp>
<html lang="it">
<a href="#example">headline</a>

<head>

  <meta charset="UTF-8">
  <title>app mobile </title>
  <meta name="description" content="Applicazione mobile">
  <meta name="keywords" content="nome, desczione, utilizzo, immagine">
  <meta name=“principio” content=“width=device-width, id_carta=1.0”>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet"> <!-- GOOGLE FONT -->
 </head>




<body>

  <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="index.html"><img alt="Brand" class="logosito" src="images/asymmetry.png"></a> <!-- LOGO -->
      </div>
      
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-right">
          <li class="active"><a href="index.html">Home <span class="sr-only">(current)</span></a></li>
          
          <li><a href="chisiamo.html">Principi</a></li>
          <li><a href="lavori.html">Descrizione</a></li>
          <li><a href="lavori.html">Utilizzo dei principi</a></li>
          
          </ul>
          </div>
          
          
<h1>Benvenuto sulla applicazione mobile! ${utente}</br>
	Selezionare dal menu: ${utente}</h1>
	<h2>------- MENU -------</h2>


    <h3> Login</h3>
      <form action="LogoutServlet" method="post">
     <input type="submit" value="Login" name="Login">
    </form>
     
     



	<h3>1. Segmentation</h3>
	<a href="https://www.google.com/search?q=segmentation&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi-wqz_2u3gAhUHmbQKHRbuBSUQ_AUIDigB&biw=1536&bih=706#imgrc=zv7Vl1CNkZ7beM:"></a>
	<p>Divide an object into independent parts....</p>
	<form action="MenuServlet" method="post">
	 <button type="submit" value="esempioManager" name="richiesta">SELECT</button>
	</form>
	
	
	
	
	
	 <%--
	 <h2>CatPhotoApp</h2>
<main>
 <a href="http://freecatphotoapp.com" target="_blank">cat photos</a>
  <img src="https://bit.ly/fcc-relaxing-cat" alt="A cute orange cat lying on its back.">
  <p>Kitty ipsum dolor sit amet, shed everywhere shed everywhere stretching attack your ankles chase the red dot, hairball run catnip eat the grass sniff.</p>
  <p>Purr jump eat the grass rip the couch scratched sunbathe, shed everywhere rip the couch sleep in the sink fluffy fur catnip scratched.</p>
  <p>Purr jump eat the grass rip the couch scratched sunbathe, shed everywhere rip the couch sleep in the sink fluffy fur catnip scratched.</p>
</main>
	 --%>
	
	
	
	<h3>2. Taking Out / Separation</h3>
	
	<p>Separate an interfering part or proprety from an object...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>3. Local Quality</h3>
	
	<p>Change an objects structure or environment from uniform to non-uniform...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
		SELECT</button>
	</form>
	
	<h3>4. Asymmetry</h3>
	
	<p>Change the shape of an object from symmetrical to asymmetrical...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>5. Merging</h3>
	
	<p>Bring closer together or merge identical or similar objects, assemble indentical or similar parts...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>6. Universality / Multi-functionality</h3>
	
	<p>Make an object or structure perform multiple functions...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>7. Nested Doll</h3>
	
	<p>Place one object inside another; place each other, in turn inside the other...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
		<h3>8. Anti-Weight / Counterweight </h3>
		
		<p>To compesate for the weight of an object, merge it with other objects that provide lift...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
		<h3>9. Prior Counteraction </h3>
		
		<p>Do an action with both harmful and useful effects. Create beforehand stresses in an object.</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>10. Prior Action </h3>
	
	<p>Perform the required change of an object before it is needed (either fully or partially)...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	
	<h3>11. Cushion in Advance </h3>
	
	<p>Prepare emergency means beforehand to compensate for the relatively low retiability of an object...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>12. Equipotentiality </h3>
	
	<p>Change operating conditions to eliminate the need to raise or lower objects in a gravity field...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
		
	<h3>13. The Other Way Round </h3>
	
	<p>Invert the action. Make movable parts fixed, and fixed parts movable...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>14. Spheroidality - Curvature </h3>
	
	<p>Instead of using rectilinear parts, use curvilinear ones...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>15. Dynamics </h3>
	
	<p>Allow the characteristics of an object to find an optimal operating condition...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>16. Partial or Excessive Action </h3>
	
	<p>If 100 percent of an objective is hard to archieve using a given solution method...<p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
		<h3>17. Another Dimension </h3>
		
		<p>To move an object in two-or three- dimensional space.Use a multi-story arrangement of objects instead...<p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
		<h3>18. Mechanical Vibration </h3>
		
		<p>Cause an object to oscillate or vibrate.</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>19. Periodic Action </h3>
	
	<p>Instead of continuous action, use periodic or pulsating actions...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	
	<h3>20. Continuity of Useful Action </h3>
	
	<p>Carry on work continuously: make all parts work at full load, all the time...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>

    <h3>21. Rushing Through / Hurrying </h3>
    
    <p>Conduct a process, or certain stages at high speed, to escape from destructive, harmful or hazardous operations...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>22. Blessing in Disguise / Convert harmful to useful </h3>
	
	<p>Use harmful factors to archive a positive effect...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>23. Feedback </h3>
	
	<p>Introduce feedback. If feedback is already used, change its magnitude or influence...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>24. Intermediary  </h3>
	
	<p>Use an intermediary carrier article or intermediary process...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	
	<h3>25. Self-Service </h3>
	
	<p>Make an object serve it self by performing auxiliary helpful functions...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
		<h3>26. Copying </h3>
		
		<p>Instead of an unavailable, expensive, fragile object, use simpler and inexpensive copies...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
		SELECT</button>
	</form>
	
	<h3>27. Cheap Short-Living Objects </h3>
	
	<p>Instead of an unavailable, expensive, fragile object, use simpler and inexpensive copies...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
	<h3>28. Replace Mechanical System </h3>
	
	<p>Replace a mechanical means with a sensory (optical, acoustic, taste or smell) means...</p>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>29. Pneumatics and Hydraulics </h3>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>30. Flexible Membranes / Thin Films </h3>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>31. Porous Materials </h3>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	<h3>32. Porous Materials </h3>
	<form action="MenuServlet" method="post">
		<button type="submit" value="esempioManager" name="richiesta">
			SELECT</button>
	</form>
	
	
     <h3>33. Homogeneity </h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta">SELECT</button>
     </form>
     
      <h3>34. Discarding and Recovering</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
       <h3>35. Parameter Change</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
     
      <h3>36. Phase Transition</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
     <h3>37. Thermal Expansion </h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
      <h3>38. Accelerate Oxidation / Boosted interaction</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
     
      <h3>39. Inert Environment</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
     
     <h3>40. Composite Materials</h3>
     <form action="BadgeServlet" method="post">
     <button type="submit" value="badgesManagement" name="richiesta"> SELECT</button>
     </form>
     
     
     <%--
     
     <h3>3. Descrizione carta</h3>
     <form action="AssegnazioneServlet" method="post">
     <button type="submit" value="assegnazioneManagement" name="richiesta"> Management Assegnazione</button>
     </form>
     
     
     
     <h3>4. Nome principio</h3>
     <form action="CustomersServlet" method="post">
     <input type="submit" value="" name="richiesta">
     </form>
    
    
    
      <h3>5. Immagine correlata al principio</h3>
     <form action="immagineServlet" method="post">
     <input type="submit" value="images" name="nesting.png">
     </form>
     
      --%>
     
 

</body>


</html>