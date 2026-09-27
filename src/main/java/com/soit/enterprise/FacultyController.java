package com.soit.enterprise;

import com.soit.enterprise.model.Faculty;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {


    //Upload Faculty Info
    private List<Faculty> theFaculties;

    @PostConstruct
    private void loadData()
    {

        //Create Faculties
        Faculty fac1 = new Faculty(1, "kelly@uc.edu", "Assistant Professor", "Kelly", "Miller");
        Faculty fac2 = new Faculty(2, "Robert@uc.edu", "Instructor Educator", "Robert", "Lee");
        Faculty fac3 = new Faculty(3, "Laura@uc.edu", "West", "Laura", "Adjunct-Professor");


        //Create our List
        theFaculties = new ArrayList<>();

        //Add to our List
        theFaculties.add(fac1);
        theFaculties.add(fac2);
        theFaculties.add(fac3);
    }

        //Mapping for "/List"
        @GetMapping("/list")
        public String listFaculties(Model theModel)
        {
            //Add faculties to the model
            theModel.addAttribute("faculties", theFaculties);

            return "list-faculties";



        }











}
