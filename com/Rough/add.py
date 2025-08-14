# class School:
#     def __init__(self, name):
#         self.name = name
#         self.students = {}
#         self.staff = {}

#     def add_student(self, student_id, student_name):
#         self.students[student_id] = {'name': student_name, 'attendance': []}

#     def add_staff(self, staff_id, staff_name):
#         self.staff[staff_id] = {'name': staff_name, 'attendance': []}

#     def record_attendance(self, person_type, person_id, date, status):
#         if person_type == 'student' and person_id in self.students:
#             self.students[person_id]['attendance'].append({'date': date, 'status': status})
#         elif person_type == 'staff' and person_id in self.staff:
#             self.staff[person_id]['attendance'].append({'date': date, 'status': status})
#         else:
#             print("Invalid person type or ID")

#     def get_attendance(self, person_type, person_id):
#         if person_type == 'student' and person_id in self.students:
#             return self.students[person_id]['attendance']
#         elif person_type == 'staff' and person_id in self.staff:
#             return self.staff[person_id]['attendance']
#         else:
#             print("Invalid person type or ID")
#             return None
a = set()
a.add(None)
print((a))