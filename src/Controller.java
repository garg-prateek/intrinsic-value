import model.IntrinsicValueOutput;
import service.IntrinsicValueService;

public class Controller {

	public static void main(String[] args) {

			IntrinsicValueService service  = new IntrinsicValueService();
			IntrinsicValueOutput output = service.calculateIntrinsicValue();
			System.out.println(output);
	}

}
