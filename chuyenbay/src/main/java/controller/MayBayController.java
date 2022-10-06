package controller;

import com.example.chuyenbay.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/maybay")
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;

	@GetMapping("/maybay")
	public List<String> findByTamBayLonHon10000() {
		return mayBayService.findByTamBayLonHon10000();
	}
}
