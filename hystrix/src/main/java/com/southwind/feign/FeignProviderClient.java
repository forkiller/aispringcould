package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author shkstart
 * @create 2021-02-07 21:51
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("student/findall")
    public Collection<Student> findAll();
    @GetMapping("student/index")
    public String index();
}
