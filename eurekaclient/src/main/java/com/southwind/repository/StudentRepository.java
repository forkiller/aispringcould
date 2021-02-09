package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @author shkstart
 * @create 2021-02-07 18:34
 */
public interface StudentRepository {
    public Collection<Student> finadAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void deleteById(Long id);

}
