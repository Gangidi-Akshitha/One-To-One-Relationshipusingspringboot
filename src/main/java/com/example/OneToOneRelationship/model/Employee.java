package com.example.OneToOneRelationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")

        public int id;
        public String name;
        public String address;
        public String department;
        public String designation;
        public String email;
        public String phone;
        public double salary;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "project_id",referencedColumnName = "id")
        public Project project;
    }

