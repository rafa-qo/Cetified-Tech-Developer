import fileinput

a = 0
for nome in fileinput.input("C:\\Users\\r.oliveira\\OneDrive - Align Technology, Inc\\Documents\\Certified Tech Developer\\InfraI\\Aula11\\lista_nomes.txt"):
    if nome.strip() == "Marcel":
        print ("Encontrei o Marcel")
    else:
        a += 1

print ("Encontrei outros ", a, "nomes")
