# PetBAG
Based on a school project where we only created the classes Pet and Dog

You work for Global Rain, a software engineering company that specializes in custom software design and development. As a junior software developer, you are part of a software development team that collaborates to create solutions for entrepreneurs, businesses, and government agencies around the world.

As part of a development team at Global Rain, you will be designing and developing custom software for a local pet boarding and grooming business, Pet Boarding and Grooming (Pet BAG). Pet BAG is seeking a way to modernize its operations by introducing custom software that will help replace inefficient paper-based processes. Your Global Rain team will collaborate to develop an app that will have the following initial functional areas: pet check in and pet check out.

As part of this team, you have been tasked with completing some preliminary work that consists of writing a Java class, writing pseudocode, and creating a flowchart. You will provide these deliverables to your supervisor.

Directions
Your supervisor has given you a specification document which details Pet BAG’s software needs and includes a UML Class diagram. Using these documents, you will create both a Java class and a summary report. Your summary report will include pseudocode and a flowchart for one method (pet check in or pet check out), and an explanation of how your work meets object-oriented principles.

Pet.java Class File

Before you begin, it is important to understand what your client needs the software to do, and what work has already been done by your team. Review the Pet BAG Specification Document, located in the Supporting Materials section, which includes a UML Class diagram. Pay close attention to the class hierarchy, attributes, and behaviors.
To begin, open the Virtual Lab by clicking on the link in the Virtual Lab Access module. Then open your integrated development environment (IDE) and create the Pet class based on the specifications in the UML Class diagram. The Pet class must include the following:
All attributes with appropriate data structures. Note that the types are not specified in this UML class diagram. You will need to think about what the most appropriate data type is for each attribute.
At least one constructor method. You may use a default constructor. To score “exemplary” on this criterion, your constructor must initialize values for the petType, petName, petAge, and daysStay attributes.
Accessors and mutators for all attributes
Note: You are only being asked to create one class. Though the UML diagram shows the Pet class as part of a larger application, for this project, you are not required to connect it to other classes or to try and run it as a program. Instead, you are practicing the skill of creating a class from a UML Class diagram.
Global Rain Summary Report

When you are done implementing the Pet class, refer back to the Pet BAG Specification Document and select either the pet check in or check out method. These methods are detailed in the Functionality section of the specification document.
Open the summary report template, located in the What to Submit section. In the template, write pseudocode that lays out a plan for the method you chose. Ensure that you organize each step in a logical manner and that your method meets the specifications in the document for either the check in or check out process. Your pseudocode must not exceed one page.
Note: Remember, you will not be creating the actual code for the method, and you do not have to write pseudocode for both methods.
Based on the pseudocode you wrote, create a flowchart using a tool of your choice for the method you selected. Your flowchart will help your team communicate how you are planning to develop the software for your client. Your flowchart must be confined to one page. In your flowchart, be sure to do the following:
Include start and end points.
Include appropriate decision branching.
Align the flowchart to the check in or check out process.
Note: You may draw your flowchart by hand and take a clear picture of it, or you may use a flowcharting tool. Refer to the Supporting Materials section to help you insert your flowchart into your summary report.
Based on your software design and development experience, your supervisor has asked you to articulate your programming approach. This will help ensure clarity, consistency, and efficiency among all developers working on this app. Specifically, you have been asked to briefly explain how you applied object-oriented programming principles and concepts (such as encapsulation, inheritance, and so on) in your software development work thus far. Your explanation should be one paragraph, or four to six sentences.
Overview
Pet Boarding and Grooming (Pet BAG) is a company that provides boarding and grooming services for
dogs and cats. They want to modernize their operations by introducing custom software that will help
replace inefficient paper-based processes.
UML Class Diagram
Work on the Pet BAG application has already begun. Use this UML Class diagram, prepared by your
supervisor, to understand the relationships between the Pet, Dog, and Cat classes.
1









Functionality
Pet BAG is seeking an application that has the following initial functionality:
• Ability to check in pets
• Ability to check out pets
Each of these functional areas is described in more detail below.
Pet Check In
The method for the pet check in process should meet the following criteria:
• Determine if the pet is a dog or a cat and check for boarding space.
• There are 30 spaces for dogs and 12 for cats. Pet BAG will need to be able to adjust these counts
as the shop grows.
• If there is space for a new pet, collect the appropriate information. For returning pets, update
the information as needed.
• Gather information on the length of the stay.
• Determine if the pet owner would like the pet to be groomed. Only dogs can be groomed and
only if they stay two or more days.
• Assign the pet to a space.
Pet Check Out
The method for the pet check out process should meet the following criteria:
• Identify the pet and its boarding space.
• Determine if the pet had a grooming fee. Only dogs can be groomed and only if they stay two or
more days.
• Use the following table to calculate the total fees.
• Mark the boarding space as vacant.
Type of Pet Daily Boarding Fee Grooming Fee
Dog (greater than or equal to 30 lbs.) $34.00 $29.95
Dog (20–30 lbs.) $29.00 $24.95
Dog (fewer than 20 lbs.) $24.00 $19.95
Cat $18.00 N/A 
