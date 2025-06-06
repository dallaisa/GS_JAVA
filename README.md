# 🔥 FireSentinels - Sistema de Monitoramento de Queimadas com Microrrobôs Inteligentes

## 👥 Integrantes

| Nome                            | RM       |
|---------------------------------|----------|
| Camila Pedroza da Cunha         | 558768   |
| Isabelle Dallabeneta Carlesso   | 554592   |
| Nicoli Amy Kassa                | 559104   |


Este projeto simula uma rede de **microrrobôs sentinelas** para monitoramento ambiental em diferentes **biomas brasileiros**, detectando riscos de incêndios por meio de sensores de temperatura, umidade, gases e som. O sistema também emite alertas automatizados para comunidades próximas.

## 📦 Estrutura do Projeto

- `model/`
  - `Bioma.java` - Representa um bioma com descrição de clima e fauna.
  - `BiomaFactory.java` - Fábrica que instancia diferentes biomas, comunidades e sentinelas com dados simulados.
  - `Comunidade.java` - Representa uma comunidade localizada em um bioma.
  - `ISentinel.java` - Interface comum para robôs sentinelas.
  - `Sentinel.java` - Classe abstrata base para os sentinelas.
  - `SentinelAnt.java` - Robô subterrâneo que detecta temperatura, CO₂, metano e umidade.
  - `SentinelLadybug.java` - Robô acústico que capta sons de queimadas e sua intensidade.
  - `Alerta.java` - Representa um alerta de risco gerado pelos sensores.
  - `AlertaComunidade.java` - Estende o alerta para notificar comunidades com canal de envio.
  - `AvaliarRiscos.java` - Avalia dados dos sensores e gera níveis de alerta.

- `Main.java` - Classe principal que executa o sistema com entrada via terminal.

## 🚀 Como Executar

1. **Clone o repositório:**

```bash
git clone https://github.com/dallaisa/GS_JAVA.git
cd GS_JAVA
```

2. **Compile os arquivos:**
   
```bash
javac -d bin src/**/*.java
```

3. **Execute o sistema:**
```bash
java -cp bin Main
```

## 🎯 Funcionalidades
- Exibe biomas disponíveis para análise.
- Cria sentinelas especializados (subterrâneo e acústico) com dados simulados.
- Gera diagnóstico detalhado dos sensores.
- Avalia os riscos com base em limites de temperatura e CO₂.
- Emite alertas automáticos e simula envio para comunidades.


## 🤖 Robôs Sentinela

### 🐜 SentinelAnt
Sensores:
- Temperatura (°C)
- CO₂ (ppm)
- Metano
- Umidade


### 🐞 SentinelLadybug
Sensores:
- Tipo de som
- Intensidade do som (dB)

## 🖨️ Exemplo de Saída
```bash
=== BIOMAS MONITORADOS ===
- caatinga
- cerrado
- amazônia
- mata atlântica
- pampa
- pantanal

Qual bioma quer verificar: cerrado

--- RESUMO DA COMUNIDADE ---
Chapada do Sol (150 habs.) - Clima seco e fauna típica do cerrado

--- DIAGNÓSTICO DOS MICRORROBÔS ---
ANT 12 | Temperatura: 42.3°C | CO2: 580 ppm | Metano: 1.5 | Umidade: 18.0
LADYBUG 8 | Som: estalos | Intensidade: 72.0 dB

--- ALERTAS ---
🛑 ALERTA CRÍTICO: Temperatura e CO₂ muito elevados
📡 Alerta enviado via SMS para a comunidade!
```

## 📄 Documentação Javadoc
Gere a documentação usando:
```bash
javadoc -d docs -encoding UTF-8 -sourcepath src -subpackages model
```
