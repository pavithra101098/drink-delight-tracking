package tracking.inventorymanagement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.sprint1.dao.TrackOrderDaoImpl;
import com.sprint1.model.ProductDetails;
import com.sprint1.model.RawMaterialDetails;
import com.sprint1.util.RawMaterialOrderNotFoundException;
import junit.framework.TestCase;
public class TrackingTesting extends TestCase {
	
	ProductDetails pd =new ProductDetails();
	TrackOrderDaoImpl td = new TrackOrderDaoImpl();
	Map<String,ProductDetails> product =new HashMap<String, ProductDetails>();

public void test1() {
	pd=new ProductDetails ("1","ThumsUp",102.4,123.89,121.0,146.0,"245",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//8
	System.out.println(pd.getOrderId());
	
	assertEquals(pd.getOrderId(),"1");
}
public void test2() {
	pd=new ProductDetails ("2","Sprite",222.4,123.89,09821.0,146.0,"45897",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//8
	System.out.println(pd.getOrderId());
	
	assertEquals(pd.getOrderId(),"2");
}
public void test3() {
	pd=new ProductDetails ("3","Merinda",28976.4,123.89,09821.0,146.0,"9865",new Date(),new Date(2020, 10, 20),new Date(2020, 9, 20),new Date(2020, 8, 20),"890");//8
	System.out.println(pd.getOrderId());
	
	assertEquals(pd.getOrderId(),"3");
}
}
