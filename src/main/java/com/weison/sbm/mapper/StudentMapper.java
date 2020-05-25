package com.weison.sbm.mapper;


import com.weison.sbm.domain.Student;
import com.weison.sbm.domain.StudentScore;
import com.weison.sbm.domain.StudentScores;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {

    // 增删改查
    Integer saveStudent(Student student);

    Integer deleteStudentByName(@Param("name") String name);

    Integer deleteByStudent(Student student);

    Integer updateStudent(Student student);

    // 5种查询
    Student findStudentByName(@Param("name") String name);

    List<Student> findStudents();

    List<Student> findStudentByMap(Map<String, String> map);

    List<Student> findStudentByStudent(Student student);

    List<Student> findStudentByAgeAndSex(Integer age, String sex);

    // 关联查询
    List<StudentScores> findStudentScores();

    List<StudentScore> findStudentScore();


}