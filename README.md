REGISTER NO:917722C043
NAME: HABIBA S

Event Management System with Payment Integration
Project Overview:
        This project is an Event Management System that allows regular users to view and register for events, while admin users can create, edit, and delete events.
Additionally, the system includes a payment module that enables users to make payments using different methods such as Credit Card and PayPal. 
Notifications (SMS and email) are also sent to users upon successful registration and payment.

Features:
1.User Management:
      Admin users can create events and manage users.
      Regular users can view, register for events, and make payments.
2.Event Management:
      Create, edit, and delete events by admin users.
      View available events and register for them.
3.Payment Integration:
      Supports multiple payment methods (Credit Card, PayPal).
      Process payments securely with modular payment method design.
4.Notifications:
      Send notifications upon successful event registration and payment.
      Notifications include SMS and email alerts.
5.Search and Filter Options:
      Users can filter events by criteria such as event name, location, date, and capacity.
      Search functionality enables users to quickly find relevant events 
6.Security and Data Protection:
      The system uses encapsulation and secure payment handling, protecting sensitive user and payment data.
      Role-based access ensures that admin and regular users have the appropriate permissions for event and user management. 
      
OOPS CONCEPT IMPLEMENTED IN PROJECT:  
1. Encapsulation:
    The project encapsulates data and methods within classes like `User`, `Event`, `Payment`, and `PaymentMethod`.
    Fields such as `username`, `password`, and `amount` are kept private and accessed through public methods, ensuring data security and controlled access.

2. Inheritance:
    The `AdminUser` and `RegularUser` classes inherit from the abstract class `User`, allowing for code reuse and specialization.
    Both types of users share common behavior but can have their specific functionalities like event management for admins and event registration for regular users.

3. Polymorphism:
    The project uses polymorphism with the `PaymentMethod` interface, where multiple payment methods (`CreditCardPayment`, `PayPalPayment`) implement the `pay()` method in different ways.
    This allows the system to handle various payment types uniformly.

4. Abstraction:
    The `User` class is abstract, meaning it provides a template for `AdminUser` and `RegularUser` classes.
    The abstract class defines the core behaviors that must be implemented by any type of user while hiding the complex details from other parts of the system.
