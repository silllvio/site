from django.db import models

class Perfil():
    def __init__(self, nome='', email='', telefone ='', empresa = ''):
        self.nome = nome
        self.email = email
        self.telefone = telefone
        self.empresa  = empresa

