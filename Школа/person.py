class Person:
    def __init__(self,name,about):
        self.name = name
        self.about = about
    
    def get_name(self):
        return f"{self.name}"
    def get_about(self):
        return self.about
    

teacher=Person("Кирилл","16")
a=teacher.get_name()
print(teacher.get_name())
print(a)
print(teacher.get_about())


