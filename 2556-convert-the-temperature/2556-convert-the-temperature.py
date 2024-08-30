class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        m=[]
        kelvin = celsius+273.15
        m.append(kelvin)
        Fahrenheit = celsius * 1.80 + 32.00
        m.append(Fahrenheit)
        return m