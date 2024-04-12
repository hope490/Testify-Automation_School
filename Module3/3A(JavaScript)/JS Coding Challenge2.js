function lengthConverter(value, inputUnit, outputUnit) {
    const conversionFactors = {
        'meters': {
            'meters': 1,
            'kilometers': 0.001,
            'centimeters': 100,
            'millimeters': 1000,
            'inches': 39.3701,
            'feet':4.79436,
            'yards': 9.06358,
            'miles': 0.0045689
        },
        'kilometers': {
           
        },
     
    };
    if (!conversionFactors.hasOwnProperty(inputUnit) || !conversionFactors[inputUnit].hasOwnProperty(outputUnit)) {
        return 'Invalid input or output unit';
    }
    const convertedValue = value * conversionFactors[inputUnit][outputUnit];

    return convertedValue;
}

console.log(lengthConverter(1, 'meters', 'feet')); 
console.log(lengthConverter(1000, 'millimeters', 'meters')); 
console.log(lengthConverter(1, 'yards', 'miles'));