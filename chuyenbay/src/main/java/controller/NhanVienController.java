package controller;

import com.example.chuyenbay.entity.NhanVien;
import com.example.chuyenbay.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nhanvien")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/timluong")
	public List<NhanVien> findAll() {
		return nhanVienService.findByLuongNhoHon10000();
	}
}
