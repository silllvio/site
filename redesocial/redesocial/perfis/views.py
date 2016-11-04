from django.shortcuts import render
from perfis.models import Perfil


# Create your views here.
def index(request):
    return render(request,'index.html')

def exibir(request,perfil_id):
    print ' ID do perfil %s' % (perfil_id)
    perfil = Perfil()
    if perfil_id == '1':
        perfil = Perfil('silvio', '@', '11111','empresa')
    if perfil_id == '2':
        perfil = Perfil('pedro', '@', '11111', 'empresa')
        # print perfil.nome,perfil.email
    # print perfil.telefone

    return render(request,'perfil.html', {"p" : perfil})

