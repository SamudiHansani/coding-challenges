Array.prototype.myReduce = function (callback, initialValue) {
  const arr = this;
  let returnValue = initialValue;
  if (typeof callback !== "function") {
    throw new TypeError(callback + " is not a function");
  }
  if (arr.length === 0 && initialValue === undefined) {
    throw new TypeError("Reduce of empty array with no initial value");
  }
  if (arr.length === 0) {
    return initialValue;
  }
  let startIndex = 0;
  if (initialValue === undefined) {
    returnValue = arr[0];
    startIndex = 1;
  }
  for (let i = startIndex; i < arr.length; i++) {
    returnValue = callback(returnValue, arr[i], i, arr);
  }
  return returnValue;
};
