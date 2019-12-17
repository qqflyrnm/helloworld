package cn.how2j.springcloud.client;
 
import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import cn.how2j.springcloud.pojo.Product;
 
    @FeignClient(value = "PRODUCT-DATA-SERVICE")
    public interface ProductClientFeign {
     
        @GetMapping("/products")
        public List<Product> listProdcuts();
    }
