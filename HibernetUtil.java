package product;
import javax.swing.plaf.basic.BasicIconFactory;


public class HibernetUtil 
{
private static BasicIconFactory sessionFactory;
	static
	{
		try 
		{
			//StandardServiceRegistry registry= new StandardServiceRegistryBuilder().
			//configure("hibernate.cfg.xml").build();
			//Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
			//sessionFactory= metadata.getSessionFactoryBuilder().build();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static BasicIconFactory getSessionFactory()
	{
		//return BasicIconFactory;
	}
}

