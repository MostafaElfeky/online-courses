package com.seniorsteps.app;



import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.seniorsteps.app.filter.CourseFilter;
import com.seniorsteps.app.models.Category;
import com.seniorsteps.app.models.Course;
import com.seniorsteps.app.models.Instructor;
import com.seniorsteps.app.repository.CourseRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
@WebAppConfiguration
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;
	
	
	@Ignore
	@Test
    public void testSaveCourse() throws Exception {

		Course course = courseRepository.save(getDummyCourse());
        System.out.println(" Course Insert status: " + course);
	}
	
	@Test
	@Ignore
    public void testListCourses() throws Exception {

		CourseFilter filter = new CourseFilter();
		filter.setCount(10);
		
		List<Course> courses = courseRepository.list(filter);
		
		for (Course course : courses) {
			System.out.println(course);
		}
	}
	
	@Test
	@Ignore
    public void testFindCourseById() throws Exception {

		Course course = courseRepository.findById(10);
        System.out.println(" Course: " + course);
	}
	
	@Test
	@Ignore
    public void testDeleteCourse() throws Exception {

		boolean deleted = courseRepository.delete(12);
        System.out.println(" Course deleted: " + deleted);
	}
	
	@Test
//	@Ignore
    public void testUpdateCourse() throws Exception {

		Course course = getDummyCourse();
		course.setId(10);
		
		boolean updated = courseRepository.update(course);
        System.out.println(" Course updated: " + updated);
	}
	
	private Course getDummyCourse() {
		
		Course course = new Course();
		course.setTitle("Effective java programming 3d");
		course.setCategory(new Category(1));
		course.setInstructor(new Instructor(1));
		
		return course;
	}


	
}
