import provider as pr

def student():
    menu=int(input("What do you want? \n\
             View ratings-enter 1\n\
             View attendance -enter 2 \n\
             Exit- enter 3\n"))
    while not  (menu==1 or menu==2):
        print("You enter wrong number!Try again\n")
        menu=int(input("What do you want? \n\
                 View ratings-enter 1\n\
                 View attendance -enter 2 \n\
                 Exit- enter 3"))
    pr.student_list("Ученики")             
    while True:
        id_student=input("Enter id student: \n")
        try:
            m=int(id_student)
            if menu==1:
                print([x for x in pr.printer("Оценки") if x[0]==m])
                break
            if menu==2:
                print([x for x in pr.printer("Посещаемость") if x[0]==m])
                break
          
            
            
            
        except ValueError:
            print("\nYou enter wrong number. Try again!")      
        
# student()      
        
  
        
        
    