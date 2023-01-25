import provider as pr
from datetime import date
import person as p


def append_student():
    wb = pr.work_book()
    sheet = wb['Ученики']
    i = pr.empty_line('Ученики')
    sheet.cell(row=i, column=1).value = i-1
    name_student=input("Enter name of student:\n")
    age_student=input("Enter age of student:\n")
    Student=p.Person(name_student,age_student)
    sheet.cell(row=i, column=2).value = Student.get_name()
    sheet.cell(row=i, column=3).value = Student.get_about()
    wb.save(filename='Классный журнал 7а.xlsx')
    wb.close()

def see_attendance():
    while True:
        menu_director = input(("What do you want to see?\n\
                All attendance - enter 1\n\
                Attendance student by id - enter 2\n\
                Exit-enter 3\n"))
        try:
                m = int(menu_director)
                if m == 1:
                        print([x for x in pr.printer("Посещаемость")])
                        break
                elif m == 2:
                        pr.student_list("Ученики")
                        d_student = int(input("Enter id student: \n"))
                        print([x for x in pr.printer("Посещаемость") if x[0] == d_student])
                        break
                elif m == 3:
                        break
                

        except ValueError:
            print("\nYou enter wrong number. Try again!")
def see_raiting():
    while True:
        menu_director = input(("What do you want to see?\n\
                All raiting - enter 1\n\
                Raiting student by id - enter 3\n\
                Exit-enter 3\n"))
        try:
                m = int(menu_director)
                if m == 1:
                        print([x for x in pr.printer("Оценки")])
                        break
                elif m == 2:
                        pr.student_list("Ученики")
                        d_student =int(input("Enter id student: \n"))
                        print([x for x in pr.printer("Оценки") if x[0] == d_student])
                        break
                elif m == 3:
                        break
        except ValueError:
            print("\nYou enter wrong number. Try again!")
            
def append_teacher():
        wb = pr.work_book()
        sheet = wb['Учителя']
        i = pr.empty_line('Учителя')
        sheet.cell(row=i, column=1).value = i-1
        name_teacher=input("Enter name of teacher:\n")
        subject_teacher=input("Enter subject of teacher:\n")
        Teacher=p.Person(name_teacher,subject_teacher)
        sheet.cell(row=i, column=2).value = Teacher.get_name()
        sheet.cell(row=i, column=3).value = Teacher.get_about()
        wb.save(filename='Классный журнал 7а.xlsx')
        wb.close()

def start_director():
    password = input("Enter the password:\n ")
    while not password == "Papovo110283":
        password = input("\nYou enter wrong password. Try again!\n")
    while True:
        menu_director = input("What do you want?\n\
        See a rating - enter 1\n\
        See attendance - enter 2\n\
        Append techer - enter 3\n\
        Append studenr - enter 4\n\
        Exit - enter 5\n")
        try:
                n = int(menu_director)
                if n == 1:
                        see_raiting()
                if n == 2:
                        see_attendance()
                if n==3:
                       append_teacher() 
                
                if n==4:
                        append_student()
                if n == 5:
                        break
                

        except ValueError:
            print("\nYou enter wrong number. Try again!")           
       
