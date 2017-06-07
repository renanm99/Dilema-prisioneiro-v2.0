class Desafio
	def caixaEletronico
		print "Digite o valor que deseja sacar: "

		resto = gets.to_i

		a = 100


		for i in 0...7
			cedula = resto.to_i/a.to_i
			resto %= a.to_i
			print cedula,  " cedulas de R$", a.to_i ,",00 \n"
			if(a == 50 || a == 5)
				a/=2.5
				next
			end
			a/=2
			i+=1

		end
	end
end

a = Desafio.new

a.caixaEletronico