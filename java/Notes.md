 - This repo contains the code for Spring Bioot with JPA using Hibernate

===================================
 - The steps for creating custom JPA methods are as follows(explained considering the repo code as example)
 - We have a AutomobileRepository class that extends JpaRepository
 - For creating custom query in Spring JPA create an inteface AutomobileRepositoryCustom (<Respository class name>Custom)
 - Create an implementation class that extends the interface creates in above step AutomobileRepositoryImpl (<Respository class name>Impl). Provide the implementation of custom methods
 - The AutomobileRepository  should also extend AutomobileRepositoryCustom interface
 - =============================
