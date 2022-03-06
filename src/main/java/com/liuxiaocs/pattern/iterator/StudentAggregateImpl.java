package com.liuxiaocs.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    // 添加学生
    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    // 删除学生
    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    // 获取迭代器对象，用来遍历
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
