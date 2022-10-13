package com.algodomain.algodomaintask1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.algodomain.algodomaintask1.dao.ChargesDao;
import com.algodomain.algodomaintask1.dao.ProductDao;
import com.algodomain.algodomaintask1.dto.ProductChargesDetails;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;

	@Autowired
	ChargesDao dao2;

	@Override
	public ProductChargesDetails getData(int id) {
		ProductChargesDetails detailsDto = new ProductChargesDetails();
		Map<String, Double> map = new HashMap<String, Double>();
		String charges=dao2.getReferenceById(dao.getReferenceById(id).getProductCategory()).getProductCategory();
		detailsDto.setProductId(id);
		detailsDto.setName(dao.getReferenceById(id).getProductName());
		detailsDto.setType(dao.getReferenceById(id).getProductType());
		detailsDto.setCategory(dao.getReferenceById(id).getProductCategory());
		detailsDto.setBasePrice(dao.getReferenceById(id).getProductPrice());

		if (dao.getReferenceById(id).getProductCategory() == dao2.getReferenceById(dao.getReferenceById(id).getProductCategory())
				.getProductCategory()) {

			double tproductPrice = dao.getReferenceById(id).getProductPrice();

			detailsDto.setDiscount(dao.getReferenceById(id).getProductPrice() * dao2.getReferenceById(charges).getDiscount() / 100);

			map.put("delivery", dao2.getReferenceById(charges).getDeliveryCharge());

			map.put("gst", (tproductPrice - detailsDto.getDiscount()) * dao2.getReferenceById(charges).getGst() / 100);

			detailsDto.setCharges(map);

			detailsDto.setFinalCharges(tproductPrice - tproductPrice * (dao2.getReferenceById(charges).getDiscount() / 100)
					+ (tproductPrice - detailsDto.getDiscount()) * (dao2.getReferenceById(charges).getGst() / 100)
					+ dao2.getReferenceById(charges).getDeliveryCharge());

		}

		return detailsDto;
	}

	@Override
	public ProductDetailsDto add(ProductDetailsDto dto) {
		if (dto != null) {
			return dao.save(dto);
		} else {
			return null;
		}
	}

	@Override
	public ProductDetailsDto update(ProductDetailsDto dto) {
		return dao.save(dto);
	}

	@Override
	public void deleteData(int id) {
		Optional<ProductDetailsDto> findById = dao.findById(id);
		dao.delete(findById.get());
	}
}
