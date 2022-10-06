package controller;

import com.example.chuyenbay.entity.ChuyenBay;
import com.example.chuyenbay.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;

	@GetMapping("/danhsachchuyenbay")
	public List<ChuyenBay> findAll() {
		return chuyenBayService.getDsChuyenBay();
	}

	@GetMapping("/{ChuyenBayId}")
	public Optional<ChuyenBay> findById(@PathVariable String ChuyenBayId) {
		return chuyenBayService.getChuyenBayById(ChuyenBayId);
	}

	@GetMapping("/gaden/{GaDenId}")
	public List<ChuyenBay> findByGaDen(@PathVariable String GaDenId) {
		return chuyenBayService.findByGaDen(GaDenId);
	}

	
	@DeleteMapping("/{ChuyenBayId}")
	public String deleteChuyenBay(@PathVariable String ChuyenBayId) {
		return chuyenBayService.deleteChuyenBay(ChuyenBayId);
	}
}
