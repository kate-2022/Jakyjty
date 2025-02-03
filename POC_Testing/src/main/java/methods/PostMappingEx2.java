package methods;


	import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;


	@RestController
	@RequestMapping("/api/employee")
	public class PostMappingEx2 {

		@PostMapping("/save")
		public ResponseEntity<String> showData(@RequestBody Employee employee) {
			System.out.println(employee);
			return new ResponseEntity<String>("hello", HttpStatus.OK);
		}
}
