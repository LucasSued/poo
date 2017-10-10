<html>
<head>
<title>Insert title here</title>
</head>
<body>
  <%
    String p1=request.getParameter("valor1");
    String p2=request.getParameter("valor2");
    String op=request.getParameter("operacao");
    double valor1=0;
	double valor2=0;
	double resul=1;
	int opcao=1;
     try{
    	  valor1=Double.parseDouble(p1);
    	  valor2=Double.parseDouble(p2);
    	  switch(op){
    	  case "somar":
    		  resul=valor1+valor2;
    		  
    		  break;
    	  }
    	  
    	 
     }catch(NumberFormatException e){
    	 
    	 valor1=0;
    	 valor2=0;
     }
     session.setAttribute("resul", resul);
	  response.sendRedirect("mostrar.jsp");
  %>
</body>
</html>