package Encapsulation;

/*
 * 
 * The process of restricting access to data members is called ENCAPSUALTION
 * 
 * Authorization, Authentication, Verification, Validation
 * 
 * 
| Aspect                 | **Authentication**                 | **Authorization**                             | **Verification**                                  | **Validation**                                          |
| ---------------------- | ---------------------------------- | --------------------------------------------- | ------------------------------------------------- | ------------------------------------------------------- |
| **Definition**         | Confirms **who the user is**       | Determines **what the user is allowed to do** | Confirms the **truth or accuracy of information** | Ensures **data is correct, meaningful, and acceptable** |
| **Primary Question**   | *Are you who you claim to be?*     | *What can you access or perform?*             | *Is this information genuine?*                    | *Is this data valid and usable?*                        |
| **Occurs When**        | At **login time**                  | After authentication                          | During **identity or data confirmation**          | During **data entry or processing**                     |
| **Focus**              | Identity                           | Permissions & access control                  | Accuracy & correctness                            | Data integrity & constraints                            |
| **Example**            | Login using username & password    | Admin can delete users, user cannot           | OTP email verification                            | Checking if email format is valid                       |
| **Methods Used**       | Passwords, biometrics, OTP, tokens | Role-Based Access Control (RBAC), ACLs        | Email/SMS OTP, document checks                    | Regex, range checks, schema checks                      |
| **System Level**       | Security                           | Security                                      | Trust & correctness                               | Data quality                                            |
| **Mandatory Order**    | Happens **first**                  | Happens **after authentication**              | Can happen anytime                                | Can happen anytime                                      |
| **Failure Result**     | User not logged in                 | Access denied                                 | Operation rejected                                | Input rejected                                          |
| **Real-World Analogy** | Showing ID at airport              | Boarding pass determines seat & zone          | Checking passport authenticity                    | Ensuring ticket date is valid                           |

 * 
 * IS-A defines acquirement
 * HAS-A defines containment
 * 
 * */