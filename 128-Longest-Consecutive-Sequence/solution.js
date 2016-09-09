/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    var map = {};
    nums.forEach(function(num){
        map[num] = 1;
    });
    var result = 0;
    nums.forEach(function(num){
        var up = num + 1;
        while(map[up]){
            delete map[up];
            up++;
        }
        
        var down = num -1;
        while(down){
             delete map[down];
             down--;
        }
        console.log('up', up);
        console.log('down', down);
        result = Math.max(result, up-down-1);
    });
    return result;
    
};