package lv.tsi.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class mainControlelr {

        @Autowired
        private StudentRepository studentrepository;
        @Autowired
        private TeacherRepository teacherrepository;

        @GetMapping(path = "/getCourses")
        public ResponseEntity<Iterable<Student>> getStudents() {
            return new ResponseEntity<>(studentrepository.findAll(), HttpStatus.OK);
        }



        @GetMapping(path = "/getSchedule")
        public ResponseEntity<Iterable<Teacher>> getNurse() {
            return new ResponseEntity<>(teacherrepository.findAll(), HttpStatus.OK);
        }


    }
