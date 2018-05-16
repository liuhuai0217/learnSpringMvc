

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.bean.Category;
import com.app.service.BookService;

@ContextConfiguration(locations={"classpath:spring-mvc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BookServiceTest {

	@Autowired
	public BookService b;
	@Test
	public void test1(){
		Category book = b.getCategoryById(1L);
		System.out.println(book.getName());
	}
}
