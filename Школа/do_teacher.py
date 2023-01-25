import provider as pr
from datetime import date

def start_teacher():
    password=input("Enter the password:\n ")
    while not password=="Papovo0283":
        password=input("\nYou enter wrong password. Try again!\n")
    while True:
        menu_teacher=input("What do you want?\n\
        Put a rating - enter 1\n\
        Put attendance - enter 2\n\
        Exit - enter 3\n")  
        try:
            n=int(menu_teacher)
            if n==1:
                put_rating()
            if n==2:
                put_attendance()
            if n==3:
                break
        except ValueError:
            print("\nYou enter wrong number. Try again!")
    

def put_rating():
    wb=pr.work_book()
    sheet = wb['Оценки']
    i=pr.empty_line('Оценки')
    sheet.cell(row=i, column=2).value=date.today()
    pr.student_list("Ученики") 
    sheet.cell(row=i, column=1).value=input("Enter id student: \n") 
    pr.subject_list("Предметы")
    sheet.cell(row=i, column=3).value=input("Enter subject:  \n")
    sheet.cell(row=i, column=4).value=input("Enter raiting:  \n")
    wb.save(filename ='Классный журнал 7а.xlsx')
    wb.close()
  
        
def put_attendance():
    wb=pr.work_book()
    sheet = wb['Посещаемость']
    i=pr.empty_line('Посещаемость')
    sheet.cell(row=i, column=2).value=date.today()
    pr.student_list("Ученики") 
    sheet.cell(row=i, column=1).value=input("Enter id student: \n") 
    pr.subject_list("Предметы")
    sheet.cell(row=i, column=3).value=input("Enter subject:  \n")
    sheet.cell(row=i, column=4).value=input("Enter attendance:  \n")
    wb.save(filename ='Классный журнал 7а.xlsx')
    wb.close()

  

    
   


