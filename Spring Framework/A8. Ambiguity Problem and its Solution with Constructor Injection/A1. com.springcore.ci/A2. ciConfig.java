<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context" xmlns:p="http://www.springframework.org/schema/p" xmlns:c="http://www.springframework.org/schema/c" xsi:schemaLocation="http://www.springframework.org/schema/beans
 https://www.springframework.org/schema/beans/spring-beans.xsd
 http://www.springframework.org/schema/context
 http://www.springframework.org/schema/context/context/spring-context.xsd">
    
    <bean class="com.springcore.ci.Addition" name="add">
    	 <constructor-arg value="12"/>
    	<constructor-arg value="34"/> 
    	<!-- by default spring inn values ko as a string treat krta hai but kyuki humare Addition class mai koi string wala constructor hai hi nhi
    	to woh upar se niche tak order dekhega aur uss hisab se run karega, upar int,int wala constructor hai to usme values allot hogi. agar mai double wala constructor upar krdeta hu to woh wala pehle chalega -->
        <!--but agar string wali method rakhi hume after above methods to woh string wali hi run karega -->
   		
   		<!-- but agar aap yeh default behaviour change krna chahte ho, aap chahte ho ki yeh int,int  walahi run karna hai chahe woh koi bhi order mai to
   		app waisa bta skte ho ki pehla wala argument int ho aur dusra wala argument bhi int ho -->
   		<!-- <constructor-arg value="12" type="int" index="0"/>
   		<constructor-arg value="34" type="int" index="1"/> -->
   	<!-- hum isme index bhi de skte hai, index ke hisab woh uss number ke parameter ko value assign hogi -->
   
    </bean>
	 

</beans>
