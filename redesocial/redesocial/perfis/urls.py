from django.conf.urls import include, url
from django.contrib import admin

urlpatterns = [
    url(r'^$','perfis.views.index'),
    url(r'^perfis/(?P<perfil_id>\d+)$','perfis.views.exibir')
]
