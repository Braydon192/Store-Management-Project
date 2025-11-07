# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](UMLDiagram.png)

## Description

My project is a Video Game Store Management System that uses object-oriented programming concepts such as classes, objects, inheritance, and encapsulation. I chose a video game store because I enjoy gaming and wanted to create a program that organizes products like consoles, games, and accessories. The main class, Product, includes shared variables such as name, price, and stock, while subclasses like Console, VideoGame, and Accessory extend it with their own unique attributes. I used the Scanner class for user input, allowing users to enter information for a new video game that is then displayed in the console using the toString() method. This project shows how constructors, getters/setters, and inheritance can be used to build a realistic, interactive store system.
