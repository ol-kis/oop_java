import do_teacher as d_t
import do_director as d_d
import do_student as d_s


def welcome():
    print("Welcome to the school magazine")
    while True:
        try: 
            menu=int(input("Select a user\n\
            Director enter 1\n\
            Teacher - enter 2\n\
            Student - enter 3\n\
            Exit - enter 4\n"))
            if menu==1:
                d_d.start_director()               
            elif menu==2:
                d_t.start_teacher()
            elif menu==3:
                d_s.student()
            elif menu==4:
                break                         
        except ValueError:
            print("\nYou enter wrong number. Try again!") 

   
            