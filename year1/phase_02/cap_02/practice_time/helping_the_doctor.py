# Requesting student data

student_email = input("Enter the student's email")
half_yearly_note = float(input("Enter the student's semester grade:"))

# Performing the logical test
if half_yearly_note > 8.5:
    print("SENDING EMAIL TO {}".format(student_email))